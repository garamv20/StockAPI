package com.dayone.config;

import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Trie<String, String> trie() { // Trie인스턴스를 Bean으로 등록
        return new PatriciaTrie<>();
    }
}
