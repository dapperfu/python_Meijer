package com.adobe.marketing.mobile.assurance.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/h;", "", "", "stringValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "d", "e", "f", "g", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: com.adobe.marketing.mobile.assurance.internal.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC6426h {
    PROD("prod"),
    STAGE("stage"),
    QA("qa"),
    DEV("dev");


    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, EnumC6426h> f62256c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final String stringValue;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0081\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/h$a;", "", "<init>", "()V", "", "stringValue", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "a", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/assurance/internal/h;", "", "lookup", "Ljava/util/Map;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.assurance.internal.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @JvmName
        public final EnumC6426h a(String stringValue) {
            Intrinsics.j(stringValue, "stringValue");
            EnumC6426h enumC6426h = (EnumC6426h) EnumC6426h.f62256c.get(stringValue);
            return enumC6426h == null ? EnumC6426h.PROD : enumC6426h;
        }
    }

    @JvmStatic
    @JvmName
    public static final EnumC6426h e(String str) {
        return INSTANCE.a(str);
    }

    static {
        EnumC6426h[] enumC6426hArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(enumC6426hArrValues.length), 16));
        for (EnumC6426h enumC6426h : enumC6426hArrValues) {
            linkedHashMap.put(enumC6426h.stringValue, enumC6426h);
        }
        f62256c = linkedHashMap;
    }

    EnumC6426h(String str) {
        this.stringValue = str;
    }
}
