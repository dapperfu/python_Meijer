package com.meijer.mobile.core.networking.deserializer;

import com.google.gson.JsonParseException;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import java.lang.reflect.Type;
import rk.EnumC16795a;

/* loaded from: classes7.dex */
public class AccountServiceErrorTypeDeserializer implements j<EnumC16795a> {
    @Override // com.google.gson.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC16795a deserialize(k kVar, Type type, i iVar) throws JsonParseException {
        return EnumC16795a.b(kVar.h());
    }
}
