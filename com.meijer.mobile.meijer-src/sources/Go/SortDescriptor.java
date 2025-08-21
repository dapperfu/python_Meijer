package Go;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"LGo/b;", "", "", "Lcom/meijer/mobile/product/model/fulldetails/models/search/SortCode;", "code", "name", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "getName", "c", "Z", "()Z", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Go.b, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class SortDescriptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    public SortDescriptor() {
        this(null, null, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortDescriptor)) {
            return false;
        }
        SortDescriptor sortDescriptor = (SortDescriptor) other;
        return Intrinsics.e(this.code, sortDescriptor.code) && Intrinsics.e(this.name, sortDescriptor.name) && this.isSelected == sortDescriptor.isSelected;
    }

    public SortDescriptor(String code, String name, boolean z10) {
        Intrinsics.j(code, "code");
        Intrinsics.j(name, "name");
        this.code = code;
        this.name = name;
        this.isSelected = z10;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "SortDescriptor(code=" + this.code + ", name=" + this.name + ", isSelected=" + this.isSelected + ')';
    }

    public /* synthetic */ SortDescriptor(String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10);
    }
}
