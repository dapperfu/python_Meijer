package Dh;

import Dh.x;
import Ji.C;
import ak.AbstractC5607a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"LDh/c;", "", "Lak/a;", "title", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "description", "LDh/x;", "sectionId", "<init>", "(Lak/a;LJi/C;Lak/a;LDh/x;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "d", "()Lak/a;", "b", "LJi/C;", "()LJi/C;", "c", "LDh/x;", "()LDh/x;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class AccountChip {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ji.C icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final x sectionId;

    public AccountChip() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountChip)) {
            return false;
        }
        AccountChip accountChip = (AccountChip) other;
        return Intrinsics.e(this.title, accountChip.title) && Intrinsics.e(this.icon, accountChip.icon) && Intrinsics.e(this.description, accountChip.description) && Intrinsics.e(this.sectionId, accountChip.sectionId);
    }

    public AccountChip(AbstractC5607a title, Ji.C icon, AbstractC5607a description, x sectionId) {
        Intrinsics.j(title, "title");
        Intrinsics.j(icon, "icon");
        Intrinsics.j(description, "description");
        Intrinsics.j(sectionId, "sectionId");
        this.title = title;
        this.icon = icon;
        this.description = description;
        this.sectionId = sectionId;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final Ji.C getIcon() {
        return this.icon;
    }

    /* renamed from: c, reason: from getter */
    public final x getSectionId() {
        return this.sectionId;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.icon.hashCode()) * 31) + this.description.hashCode()) * 31) + this.sectionId.hashCode();
    }

    public String toString() {
        return "AccountChip(title=" + this.title + ", icon=" + this.icon + ", description=" + this.description + ", sectionId=" + this.sectionId + ')';
    }

    public /* synthetic */ AccountChip(AbstractC5607a abstractC5607a, Ji.C c10, AbstractC5607a abstractC5607a2, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a, (i10 & 2) != 0 ? C.d.f15495c : c10, (i10 & 4) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a2, (i10 & 8) != 0 ? x.f.f6604b : xVar);
    }
}
