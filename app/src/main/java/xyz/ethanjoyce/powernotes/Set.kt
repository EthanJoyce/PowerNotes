package xyz.ethanjoyce.powernotes

class Set(var date: Day,

          var exercise: String,
          var category: String,

          var weight: Int,
          var reps: Int,
          var distance: Double,
          var distanceUnit: String,
          var time: Double,

          var comment: String,
          var intensity: Int,
          var intensityScale: String) {

    class Day(var year: Int, var month: Int, var day: Int)

}