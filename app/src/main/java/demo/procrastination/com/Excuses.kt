package demo.procrastination.com

class Excuses {

    companion object {

        private val excuses: ArrayList<String> = arrayListOf(
            "Es ist ja schon spät am Abend",
            "Ich sollte lieber mal wieder Sport machen",
            "Das Wochenende ist mir heilig",
            "Die Klausur ist bestimmt großzügig gestellt",
            "Das steht nicht auf meiner heutigen Todo-Liste",
            "Mache ich morgen",
            "Ist ja eigentlich trivial"
        )

        fun getRandomExcuse(): String {
            return excuses[(Math.random() * excuses.size).toInt()]
        }

    }

}