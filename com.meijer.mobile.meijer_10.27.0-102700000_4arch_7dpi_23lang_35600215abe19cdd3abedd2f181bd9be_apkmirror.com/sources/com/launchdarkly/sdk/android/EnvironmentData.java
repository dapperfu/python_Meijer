package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.json.SerializationException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nh.AbstractC15796a;

/* loaded from: classes7.dex */
final class EnvironmentData {
    static final Type FLAGS_MAP_TYPE = new a().d();
    private final Map<String, DataModel$Flag> flags;

    public EnvironmentData() {
        this(new HashMap());
    }

    class a extends com.google.gson.reflect.a<Map<String, DataModel$Flag>> {
        a() {
        }
    }

    private EnvironmentData(Map<String, DataModel$Flag> map) {
        this.flags = map == null ? new HashMap<>() : map;
    }

    public static EnvironmentData e(Map<String, DataModel$Flag> map) {
        return new EnvironmentData(map);
    }

    public Map<String, DataModel$Flag> b() {
        return new HashMap(this.flags);
    }

    public DataModel$Flag c(String str) {
        return this.flags.get(str);
    }

    public Collection<DataModel$Flag> f() {
        return this.flags.values();
    }

    public EnvironmentData g(DataModel$Flag dataModel$Flag) {
        if (dataModel$Flag == null) {
            return this;
        }
        HashMap map = new HashMap(this.flags);
        map.put(dataModel$Flag.e(), dataModel$Flag);
        return new EnvironmentData(map);
    }

    public static EnvironmentData a(String str) throws SerializationException {
        try {
            Map map = (Map) AbstractC15796a.a().p(str, FLAGS_MAP_TYPE);
            for (Map.Entry entry : map.entrySet()) {
                DataModel$Flag dataModel$Flag = (DataModel$Flag) entry.getValue();
                if (dataModel$Flag.e() == null) {
                    entry.setValue(new DataModel$Flag((String) entry.getKey(), dataModel$Flag.h(), dataModel$Flag.j(), dataModel$Flag.d(), dataModel$Flag.i(), dataModel$Flag.m(), dataModel$Flag.n(), dataModel$Flag.c(), dataModel$Flag.g(), dataModel$Flag.f()));
                }
            }
            return new EnvironmentData(map);
        } catch (Exception e10) {
            throw new SerializationException(e10);
        }
    }

    public String d() {
        return AbstractC15796a.a().x(this.flags);
    }
}
