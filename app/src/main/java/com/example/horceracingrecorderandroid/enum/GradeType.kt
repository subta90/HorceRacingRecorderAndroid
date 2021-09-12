package com.example.horceracingrecorderandroid.enum

enum class GradeType {
    G1 {
        override fun gradeName(): String {
            return "G1"
        }
    },
    G2 {
        override fun gradeName(): String {
            return "G2"
        }
    },
    G3 {
        override fun gradeName(): String {
            return "G3"
        }
    },
    LISTED {
        override fun gradeName(): String {
            return "リステッド"
        }
    },
    SPECIALOPEN {
        override fun gradeName(): String {
            return "オープン特別"
        }
    },
    THREEWINS {
        override fun gradeName(): String {
            return "3勝クラス"
        }
    },
    TWOWINS {
        override fun gradeName(): String {
            return "2勝クラス"
        }
    },
    ONEWIN {
        override fun gradeName(): String {
            return "1勝クラス"
        }
    },
    NOTWON {
        override fun gradeName(): String {
            return "新馬・未勝利"
        }
    };
    abstract fun gradeName(): String
}
