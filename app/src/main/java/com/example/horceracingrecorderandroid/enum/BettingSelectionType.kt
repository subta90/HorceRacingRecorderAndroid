package com.example.horceracingrecorderandroid.enum

enum class BettingSelectionType {
    Win {
        override fun bettingSelectionName(): String {
            return "単勝"
        }
    },
    Place {
        override fun bettingSelectionName(): String {
            return "複勝"
        }
    },
    BracketQuinella {
        override fun bettingSelectionName(): String {
            return "枠連"
        }
    },
    Quinella {
        override fun bettingSelectionName(): String {
            return "馬連"
        }
    },
    QuinellaPlace {
        override fun bettingSelectionName(): String {
            return "ワイド"
        }
    },
    Exacta {
        override fun bettingSelectionName(): String {
            return "馬単"
        }
    },
    Trio {
        override fun bettingSelectionName(): String {
            return "3連複"
        }
    },
    Tierce {
        override fun bettingSelectionName(): String {
            return "3連単"
        }
    };
    abstract fun bettingSelectionName(): String
}
