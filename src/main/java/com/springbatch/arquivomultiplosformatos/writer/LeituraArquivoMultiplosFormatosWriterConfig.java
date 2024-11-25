package com.springbatch.arquivomultiplosformatos.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LeituraArquivoMultiplosFormatosWriterConfig {

    @Bean
    @SuppressWarnings({"rawtypes", "unchecked"})
    public ItemWriter leituraArquivoDelimitadoWriter() {
        return items -> items.forEach(clienteOrTransaction -> log.info("{}", clienteOrTransaction));
    }
}
