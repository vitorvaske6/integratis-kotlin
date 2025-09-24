package br.com.vaske.integratis.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}