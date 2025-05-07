package com.fiap.criacionais.factory_method;

public class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
