(println "Ola, mundo")

(println "Tabuada - Digite um numero no campo de I/O: ")
(flush)

(let [entrada (read-line)]
    (let [numero (Integer/parseInt entrada)]
        (doseq [x (range 1 11)]
            (println (* numero x))
        )
    )
)




    