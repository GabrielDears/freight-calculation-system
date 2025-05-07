package com.fiap.criacionais.factory_method;

public class FactoryMethodMain {

    private enum DocumentCreatorType {
        WORD, PDF
    }

    public static void main(String[] args) {
        DocumentCreatorType[] values = DocumentCreatorType.values();
        for (DocumentCreatorType value : values) {
            DocumentCreator documentCreator = switch (value) {
                case PDF -> new PdfDocumentCreator();
                case WORD -> new WordDocumentCreator();
            };
            Document document = documentCreator.createDocument();
            document.printDocumentInfo();
        }
    }
}
