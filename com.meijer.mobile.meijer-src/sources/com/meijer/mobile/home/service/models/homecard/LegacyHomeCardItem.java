package com.meijer.mobile.home.service.models.homecard;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardItem;", "", "", "cardType", "", "itemCount", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "I", "()I", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LegacyHomeCardItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String cardType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int itemCount;

    public LegacyHomeCardItem(@g(name = "cardType") String cardType, @g(name = "itemCount") int i10) {
        Intrinsics.j(cardType, "cardType");
        this.cardType = cardType;
        this.itemCount = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* renamed from: b, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }
}
