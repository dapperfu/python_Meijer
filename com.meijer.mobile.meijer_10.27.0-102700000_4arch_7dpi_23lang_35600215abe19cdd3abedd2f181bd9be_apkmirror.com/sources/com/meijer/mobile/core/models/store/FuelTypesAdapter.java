package com.meijer.mobile.core.models.store;

import com.squareup.moshi.f;
import com.squareup.moshi.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ok.EnumC16091b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/core/models/store/FuelTypesAdapter;", "", "<init>", "()V", "", "json", "Lok/b;", "fromJson", "(Ljava/lang/String;)Lok/b;", "enum", "toJson", "(Lok/b;)Ljava/lang/String;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FuelTypesAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final FuelTypesAdapter f96135a = new FuelTypesAdapter();

    @f
    public final EnumC16091b fromJson(String json) {
        EnumC16091b enumC16091b;
        Intrinsics.j(json, "json");
        EnumC16091b[] enumC16091bArrValues = EnumC16091b.values();
        int length = enumC16091bArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumC16091b = null;
                break;
            }
            enumC16091b = enumC16091bArrValues[i10];
            if (Intrinsics.e(enumC16091b.getFullName(), json)) {
                break;
            }
            i10++;
        }
        return enumC16091b == null ? EnumC16091b.f153854m : enumC16091b;
    }

    @w
    public final String toJson(EnumC16091b enumC16091b) {
        Intrinsics.j(enumC16091b, "enum");
        String fullName = enumC16091b.getFullName();
        return fullName == null ? "" : fullName;
    }

    private FuelTypesAdapter() {
    }
}
