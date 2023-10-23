import java.util.*;
import java.util.stream.Stream;

public class Main {

    static class Node {
        String value;
        Node next;

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static Iterable<String> parse(String[] lines) {
        Map<String, Node> graph = new HashMap<>();
        List<String> results = new ArrayList<>();

        for (String line : lines) {
            if (line.contains(",")) {
                String[] values = line.split(",");
                String returnValue;

                try {
                    returnValue = String.valueOf(linkedListIntersection(Arrays.stream(values).map(String::trim), graph));
                } catch (IllegalStateException ex) {
                    if (ex.getMessage().equals("Cycle detected.")) {
                        returnValue = "Error Thrown!";
                    } else if(ex.getMessage().equals("TRUE")) {
                        returnValue = "True";
                    }else{
                       throw  ex;
                    }
                }

                results.add(returnValue);
            } else if (line.contains("->")) {
                String[] splitStr = line.split("->");
                String current = splitStr[0].trim();
                String next = splitStr[1].trim();

                Node nextNode = graph.computeIfAbsent(next, k -> new Node(next, null));

                Node currentNode = graph.get(current);
                if (currentNode != null) {
                    currentNode.next = nextNode;
                } else {
                    graph.put(current, new Node(current, nextNode));
                }
            }
        }

        return results;
    }

    private static boolean linkedListIntersection(Stream<String> nodeGroup, Map<String, Node> graph) {
        Set<String> allTraversedNodes = new HashSet<>();

        nodeGroup.forEach(value -> {
            Set<String> currentTraversedNodes = new HashSet<>();
            Node node = graph.get(value);

            while (node != null) {
                if (allTraversedNodes.contains(node.value)) {
                    throw new IllegalStateException("TRUE");
                }

                if (currentTraversedNodes.contains(node.next != null ? node.next.value : null)) {
                    throw new IllegalStateException("Cycle detected.");
                }

                allTraversedNodes.add(node.value);
                currentTraversedNodes.add(node.value);

                node = node.next;
            }
        });

        return false;
    }

    public static void main(String[] args) {
        String[] lines = new String[]{
                "a->b",
                "r->s",
                "b->c",
                "x->c",
                "q->r",
                "y->x",
                "w->z",
                "a,q,w",
                "a,c,r",
                "y,z,a,r",
                "a,w"
        };

        Iterable<String> results = parse(lines);

        for (String result : results) {
            System.out.println(result);
        }
    }
}
