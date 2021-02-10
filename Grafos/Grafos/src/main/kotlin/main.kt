/** ----------------------------------------------------------------------
*  Universidad Politecnica de San Luis Potosí
*  Ingeniería en Tecnologías de Información
*
*  Materia: Teoría Computacional
*  Profesor: Juan Carlos González Ibarra
*  Nombre:    Aarón Mishael Carrizal Méndez
*  Matricula: 180816
*
*  Escrito:       10/02/21
*  Ultima actualización:  10/02/21
*----------------------------------------------------------------------**/

//Kotlin program for validation of a graph

//import of graphs libraries (Kgraph: https://github.com/lamba92/KGraph)
import it.lamba.kgraph.data.impl.dsl.bidirectionEdge
import it.lamba.kgraph.data.impl.dsl.edge
import it.lamba.kgraph.data.impl.dsl.graphBuilder
import it.lamba.kgraph.data.impl.dsl.node

fun main(args: Array<String>) {

    //declaration of a graph
    val graph = graphBuilder {

        //declaration of nodes
        val nodeA = node {
            id = "a"
            value = 1
        }
        val nodeB = node {
            id = "b"
            value = 1
        }
        val nodeC = node {
            id = "c"
            value = 1
        }
        val nodeD = node {
            id = "d"
            value = 1
        }
        val nodeE = node {
            id = "e"
            value = 1
        }

        //declaration of edges
        edge {
            initialNode = nodeA
            arrivalNode = nodeC
            cost = 1.0
        }
        edge {
            initialNode = nodeB
            arrivalNode = nodeC
            cost = 1.0
        }
        edge {
            initialNode = nodeB
            arrivalNode = nodeE
            cost = 1.0
        }
        edge {
            initialNode = nodeC
            arrivalNode = nodeD
            cost = 1.0
        }
        edge {
            initialNode = nodeC
            arrivalNode = nodeE
            cost = 1.0
        }
        edge {
            initialNode = nodeC
            arrivalNode = nodeA
            cost = 1.0
        }
        edge {
            initialNode = nodeC
            arrivalNode = nodeB
            cost = 1.0
        }
        edge {
            initialNode = nodeE
            arrivalNode = nodeB
            cost = 1.0
        }
        edge {
            initialNode = nodeD
            arrivalNode = nodeC
            cost = 1.0
        }
        edge {
            initialNode = nodeE
            arrivalNode = nodeC
            cost = 1.0
        }
    }
    //print edges of generated graph
    print(graph.edges)

    /*
    You can also add bidirectional edges, nodes or directional edges in the constructor or using the
    methods .addNode(), .addEdge() or .addBidirectionalEdge()
     */
}

