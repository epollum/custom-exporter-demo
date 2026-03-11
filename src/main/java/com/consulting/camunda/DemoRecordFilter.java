package com.consulting.camunda;

import com.sun.jdi.Value;
import io.camunda.zeebe.exporter.api.context.Context;
import io.camunda.zeebe.protocol.record.RecordType;
import io.camunda.zeebe.protocol.record.ValueType;
import io.camunda.zeebe.protocol.record.intent.Intent;

public class DemoRecordFilter implements Context.RecordFilter {
    @Override
    public boolean acceptType(RecordType recordType) {
        return false;
    }

    @Override
    public boolean acceptValue(ValueType valueType) {
        return !valueType.equals(ValueType.VARIABLE) && !valueType.equals(ValueType.VARIABLE_DOCUMENT);
    }

    @Override
    public boolean acceptIntent(Intent intent){
        Inten
    }
}
