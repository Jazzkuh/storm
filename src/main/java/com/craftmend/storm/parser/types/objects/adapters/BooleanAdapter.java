package com.craftmend.storm.parser.types.objects.adapters;


import com.craftmend.storm.Storm;
import com.craftmend.storm.parser.objects.ParsedField;
import com.craftmend.storm.parser.types.objects.StormTypeAdapter;

public class BooleanAdapter extends StormTypeAdapter<Boolean> {
    @Override
    public Boolean fromSql(ParsedField parsedField, Object sqlValue) {
        if (sqlValue == null) return null;
        return Boolean.valueOf(sqlValue.toString());
    }

    @Override
    public Object toSql(Storm storm, Boolean value) {
        return value;
    }

    @Override
    public String getSqlBaseType() {
        return "BOOLEAN";
    }

    @Override
    public boolean escapeAsString() {
        return false;
    }
}
