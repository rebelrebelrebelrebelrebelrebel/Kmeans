import org.json.JSONArray
import java.io.File

fun main() {
    val filePath = "src/main/resources/clusters.json"
    val jsonContent = File(filePath).readText()

    // Convertir el contenido JSON en un JSONArray
    val jsonArray = JSONArray(jsonContent)

    // Iterar sobre cada cluster
    for (i in 0 until jsonArray.length()) {
        val clusterArray = jsonArray.getJSONArray(i)
        println("Cluster ${i + 1}:")

        // Iterar sobre cada punto en el cluster
        for (j in 0 until clusterArray.length()) {
            val pointArray = clusterArray.getJSONArray(j)
            val x = pointArray.getDouble(0)
            val y = pointArray.getDouble(1)
            val z = pointArray.getDouble(2)
            println("  Point ${j + 1}: ($x, $y, $z)")
        }
    }
}
