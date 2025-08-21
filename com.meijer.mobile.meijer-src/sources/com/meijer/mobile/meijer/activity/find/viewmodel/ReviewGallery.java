package com.meijer.mobile.meijer.activity.find.viewmodel;

import com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/j0;", "", "Ljava/util/UUID;", "uuid", "", "", "listOfImages", "", "index", "<init>", "(Ljava/util/UUID;Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.j0, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ReviewGallery implements C12358e0.InterfaceC12363e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UUID uuid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> listOfImages;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    public ReviewGallery(UUID uuid, List<String> listOfImages, int i10) {
        Intrinsics.j(uuid, "uuid");
        Intrinsics.j(listOfImages, "listOfImages");
        this.uuid = uuid;
        this.listOfImages = listOfImages;
        this.index = i10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGallery)) {
            return false;
        }
        ReviewGallery reviewGallery = (ReviewGallery) other;
        return Intrinsics.e(this.uuid, reviewGallery.uuid) && Intrinsics.e(this.listOfImages, reviewGallery.listOfImages) && this.index == reviewGallery.index;
    }

    public int hashCode() {
        return (((this.uuid.hashCode() * 31) + this.listOfImages.hashCode()) * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "ReviewGallery(uuid=" + this.uuid + ", listOfImages=" + this.listOfImages + ", index=" + this.index + ')';
    }

    /* renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final List<String> b() {
        return this.listOfImages;
    }

    public /* synthetic */ ReviewGallery(UUID uuid, List list, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? UUID.randomUUID() : uuid, list, i10);
    }
}
