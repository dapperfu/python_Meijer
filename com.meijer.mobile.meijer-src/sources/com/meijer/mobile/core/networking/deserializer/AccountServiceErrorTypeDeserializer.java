package com.meijer.mobile.core.networking.deserializer;

import com.google.gson.JsonParseException;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import java.lang.reflect.Type;
import sk.EnumC17080a;

/* loaded from: classes8.dex */
public class AccountServiceErrorTypeDeserializer implements j<EnumC17080a> {
    @Override // com.google.gson.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC17080a deserialize(k kVar, Type type, i iVar) throws JsonParseException {
        return EnumC17080a.b(kVar.h());
    }
}
