package j9;

import g9.AbstractC14340a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lj9/d;", "Lg9/a;", "", "arg", "selection", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "K", "", "f", "()[Ljava/lang/String;", "selectionArgs", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: j9.d, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class FilterByClientId extends AbstractC14340a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String arg;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selection;

    public FilterByClientId(String arg, String selection) {
        Intrinsics.j(arg, "arg");
        Intrinsics.j(selection, "selection");
        this.arg = arg;
        this.selection = selection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterByClientId)) {
            return false;
        }
        FilterByClientId filterByClientId = (FilterByClientId) other;
        return Intrinsics.e(this.arg, filterByClientId.arg) && Intrinsics.e(this.selection, filterByClientId.selection);
    }

    @Override // g9.AbstractC14340a, g9.d
    /* renamed from: K, reason: from getter */
    public String getSelection() {
        return this.selection;
    }

    @Override // g9.AbstractC14340a, g9.d
    /* renamed from: f */
    public String[] getArgs() {
        return new String[]{this.arg};
    }

    public int hashCode() {
        return (this.arg.hashCode() * 31) + this.selection.hashCode();
    }

    public String toString() {
        return "FilterByClientId(arg=" + this.arg + ", selection=" + this.selection + ")";
    }

    public /* synthetic */ FilterByClientId(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "hardware_id=?" : str2);
    }
}
