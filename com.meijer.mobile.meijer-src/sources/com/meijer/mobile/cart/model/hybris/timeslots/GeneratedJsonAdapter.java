package com.meijer.mobile.cart.model.hybris.timeslots;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfoJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfoJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<HybrisPickupSlotInfo> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<HybrisPickupSlotInfo> constructorRef;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("activeSlotTransactionId", "pickUpSlotId", "pickUpSlotTimeString", "pickUpEndTime", "pickUpDate", "pickUpSlotTimeZone", "pickUpSlotIsAvailable", "scheduleTypeId", "partnerCustomerId");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "activeSlotTransactionId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "pickUpStartTime");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        h<Boolean> hVarF3 = moshi.f(Boolean.TYPE, SetsKt.e(), "pickUpSlotIsAvailable");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.booleanAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisPickupSlotInfo fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        Intrinsics.j(reader, "reader");
        reader.b();
        int i11 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        Boolean boolFromJson = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        while (reader.hasNext()) {
            String str = strFromJson;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw C14410c.w("activeSlotTransactionId", "activeSlotTransactionId", reader);
                    }
                    continue;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw C14410c.w("pickUpSlotId", "pickUpSlotId", reader);
                    }
                    break;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw C14410c.w("pickUpSlotIsAvailable", "pickUpSlotIsAvailable", reader);
                    }
                    break;
                case 7:
                    strFromJson7 = this.stringAdapter.fromJson(reader);
                    if (strFromJson7 == null) {
                        throw C14410c.w("scheduleTypeId", "scheduleTypeId", reader);
                    }
                    break;
                case 8:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
            }
            strFromJson = str;
        }
        String str2 = strFromJson;
        reader.d();
        if (i11 == -317) {
            if (str2 == null) {
                throw C14410c.o("activeSlotTransactionId", "activeSlotTransactionId", reader);
            }
            if (strFromJson2 == null) {
                throw C14410c.o("pickUpSlotId", "pickUpSlotId", reader);
            }
            if (boolFromJson == null) {
                throw C14410c.o("pickUpSlotIsAvailable", "pickUpSlotIsAvailable", reader);
            }
            String str3 = strFromJson8;
            String str4 = strFromJson7;
            boolean zBooleanValue = boolFromJson.booleanValue();
            if (str4 == null) {
                throw C14410c.o("scheduleTypeId", "scheduleTypeId", reader);
            }
            String str5 = strFromJson6;
            String str6 = strFromJson5;
            return new HybrisPickupSlotInfo(str2, strFromJson2, strFromJson3, strFromJson4, str6, str5, zBooleanValue, str4, str3);
        }
        String str7 = strFromJson8;
        String str8 = strFromJson7;
        Constructor<HybrisPickupSlotInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            i10 = i11;
            declaredConstructor = HybrisPickupSlotInfo.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        } else {
            i10 = i11;
        }
        Constructor<HybrisPickupSlotInfo> constructor = declaredConstructor;
        if (str2 == null) {
            throw C14410c.o("activeSlotTransactionId", "activeSlotTransactionId", reader);
        }
        if (strFromJson2 == null) {
            throw C14410c.o("pickUpSlotId", "pickUpSlotId", reader);
        }
        if (boolFromJson == null) {
            throw C14410c.o("pickUpSlotIsAvailable", "pickUpSlotIsAvailable", reader);
        }
        if (str8 == null) {
            throw C14410c.o("scheduleTypeId", "scheduleTypeId", reader);
        }
        HybrisPickupSlotInfo hybrisPickupSlotInfoNewInstance = constructor.newInstance(str2, strFromJson2, strFromJson3, strFromJson4, strFromJson5, strFromJson6, boolFromJson, str8, str7, Integer.valueOf(i10), null);
        Intrinsics.i(hybrisPickupSlotInfoNewInstance, "newInstance(...)");
        return hybrisPickupSlotInfoNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisPickupSlotInfo value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("activeSlotTransactionId");
        this.stringAdapter.toJson(writer, (q) value_.getActiveSlotTransactionId());
        writer.l("pickUpSlotId");
        this.stringAdapter.toJson(writer, (q) value_.getPickUpSlotId());
        writer.l("pickUpSlotTimeString");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPickUpStartTime());
        writer.l("pickUpEndTime");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPickUpEndTime());
        writer.l("pickUpDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPickUpDate());
        writer.l("pickUpSlotTimeZone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPickUpSlotTimeZone());
        writer.l("pickUpSlotIsAvailable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getPickUpSlotIsAvailable()));
        writer.l("scheduleTypeId");
        this.stringAdapter.toJson(writer, (q) value_.getScheduleTypeId());
        writer.l("partnerCustomerId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPartnerCustomerId());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisPickupSlotInfo");
        sb2.append(')');
        return sb2.toString();
    }
}
