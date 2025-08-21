package V2;

import V2.CreationExtras;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bJ,\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LV2/b;", "LV2/a;", "", "LV2/a$c;", "", "initialExtras", "<init>", "(Ljava/util/Map;)V", "(LV2/a;)V", "T", "key", "t", "", "c", "(LV2/a$c;Ljava/lang/Object;)V", "a", "(LV2/a$c;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends CreationExtras {
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public b(Map<CreationExtras.c<?>, ? extends Object> initialExtras) {
        Intrinsics.j(initialExtras, "initialExtras");
        b().putAll(initialExtras);
    }

    @Override // V2.CreationExtras
    public <T> T a(CreationExtras.c<T> key) {
        Intrinsics.j(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(CreationExtras.c<T> key, T t10) {
        Intrinsics.j(key, "key");
        b().put(key, t10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public b(CreationExtras initialExtras) {
        this((Map<CreationExtras.c<?>, ? extends Object>) initialExtras.b());
        Intrinsics.j(initialExtras, "initialExtras");
    }

    public /* synthetic */ b(CreationExtras creationExtras, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CreationExtras.b.f39630c : creationExtras);
    }
}
