package com.meijer.mobile.home.service.models.mperks;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/HomeMperksDto;", "", "Lcom/meijer/mobile/home/service/models/mperks/MperksCreditCardDto;", "mperksCard", "Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;", "mperksDataDto", "", PreferencesHelper.PREF_ID, "type", "<init>", "(Lcom/meijer/mobile/home/service/models/mperks/MperksCreditCardDto;Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/meijer/mobile/home/service/models/mperks/MperksCreditCardDto;Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/home/service/models/mperks/HomeMperksDto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/home/service/models/mperks/MperksCreditCardDto;", "b", "()Lcom/meijer/mobile/home/service/models/mperks/MperksCreditCardDto;", "Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;", "c", "()Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;", "Ljava/lang/String;", "d", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HomeMperksDto {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksCreditCardDto mperksCard;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksDataDto mperksDataDto;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    public HomeMperksDto(@g(name = "card") MperksCreditCardDto mperksCard, @g(name = "data") MperksDataDto mperksDataDto, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "type") String type) {
        Intrinsics.j(mperksCard, "mperksCard");
        Intrinsics.j(mperksDataDto, "mperksDataDto");
        Intrinsics.j(id2, "id");
        Intrinsics.j(type, "type");
        this.mperksCard = mperksCard;
        this.mperksDataDto = mperksDataDto;
        this.id = id2;
        this.type = type;
    }

    public final HomeMperksDto copy(@g(name = "card") MperksCreditCardDto mperksCard, @g(name = "data") MperksDataDto mperksDataDto, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "type") String type) {
        Intrinsics.j(mperksCard, "mperksCard");
        Intrinsics.j(mperksDataDto, "mperksDataDto");
        Intrinsics.j(id2, "id");
        Intrinsics.j(type, "type");
        return new HomeMperksDto(mperksCard, mperksDataDto, id2, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMperksDto)) {
            return false;
        }
        HomeMperksDto homeMperksDto = (HomeMperksDto) other;
        return Intrinsics.e(this.mperksCard, homeMperksDto.mperksCard) && Intrinsics.e(this.mperksDataDto, homeMperksDto.mperksDataDto) && Intrinsics.e(this.id, homeMperksDto.id) && Intrinsics.e(this.type, homeMperksDto.type);
    }

    public int hashCode() {
        return (((((this.mperksCard.hashCode() * 31) + this.mperksDataDto.hashCode()) * 31) + this.id.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "HomeMperksDto(mperksCard=" + this.mperksCard + ", mperksDataDto=" + this.mperksDataDto + ", id=" + this.id + ", type=" + this.type + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final MperksCreditCardDto getMperksCard() {
        return this.mperksCard;
    }

    /* renamed from: c, reason: from getter */
    public final MperksDataDto getMperksDataDto() {
        return this.mperksDataDto;
    }

    /* renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ HomeMperksDto(MperksCreditCardDto mperksCreditCardDto, MperksDataDto mperksDataDto, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mperksCreditCardDto, mperksDataDto, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? "" : str2);
    }
}
