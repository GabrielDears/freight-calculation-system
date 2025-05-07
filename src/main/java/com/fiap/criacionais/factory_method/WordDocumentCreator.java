package com.fiap.criacionais.factory_method;

public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
