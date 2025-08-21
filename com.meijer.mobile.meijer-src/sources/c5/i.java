package c5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u0019"}, d2 = {"Lc5/i;", "", "model", "Lc5/p;", "modelEqualityDelegate", "La5/h;", "imageLoader", "<init>", "(Ljava/lang/Object;Lc5/p;La5/h;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lc5/p;", "c", "()Lc5/p;", "La5/h;", "()La5/h;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object model;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p modelEqualityDelegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a5.h imageLoader;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return this.modelEqualityDelegate.c(this.model, iVar.model) && Intrinsics.e(this.imageLoader, iVar.imageLoader);
    }

    /* renamed from: a, reason: from getter */
    public final a5.h getImageLoader() {
        return this.imageLoader;
    }

    /* renamed from: b, reason: from getter */
    public final Object getModel() {
        return this.model;
    }

    /* renamed from: c, reason: from getter */
    public final p getModelEqualityDelegate() {
        return this.modelEqualityDelegate;
    }

    public int hashCode() {
        return (this.modelEqualityDelegate.b(this.model) * 31) + this.imageLoader.hashCode();
    }

    public i(Object obj, p pVar, a5.h hVar) {
        this.model = obj;
        this.modelEqualityDelegate = pVar;
        this.imageLoader = hVar;
    }
}
