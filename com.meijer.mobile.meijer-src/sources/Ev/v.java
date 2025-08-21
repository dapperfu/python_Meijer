package Ev;

import Fv.X;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0013\u0010\f¨\u0006\u001e"}, d2 = {"LEv/v;", "LEv/E;", "", "body", "", "isString", "LBv/f;", "coerceToInlineType", "<init>", "(Ljava/lang/Object;ZLBv/f;)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "h", "()Z", "b", "LBv/f;", "f", "()LBv/f;", "c", "Ljava/lang/String;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class v extends E {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bv.f coerceToInlineType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String content;

    public /* synthetic */ v(Object obj, boolean z10, Bv.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : fVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || v.class != other.getClass()) {
            return false;
        }
        v vVar = (v) other;
        return getIsString() == vVar.getIsString() && Intrinsics.e(getContent(), vVar.getContent());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object body, boolean z10, Bv.f fVar) {
        super(null);
        Intrinsics.j(body, "body");
        this.isString = z10;
        this.coerceToInlineType = fVar;
        this.content = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // Ev.E
    /* renamed from: a, reason: from getter */
    public String getContent() {
        return this.content;
    }

    /* renamed from: f, reason: from getter */
    public final Bv.f getCoerceToInlineType() {
        return this.coerceToInlineType;
    }

    /* renamed from: h, reason: from getter */
    public boolean getIsString() {
        return this.isString;
    }

    public int hashCode() {
        return (Boolean.hashCode(getIsString()) * 31) + getContent().hashCode();
    }

    @Override // Ev.E
    public String toString() {
        if (getIsString()) {
            StringBuilder sb2 = new StringBuilder();
            X.c(sb2, getContent());
            String string = sb2.toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }
        return getContent();
    }
}
