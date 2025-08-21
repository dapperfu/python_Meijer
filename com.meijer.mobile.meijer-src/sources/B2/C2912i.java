package B2;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LB2/i;", "", "<init>", "()V", "T", "LB2/D;", "serializer", "LC2/b;", "corruptionHandler", "", "LB2/f;", "migrations", "Lmv/O;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LB2/h;", "a", "(LB2/D;LC2/b;Ljava/util/List;Lmv/O;Lkotlin/jvm/functions/Function0;)LB2/h;", "LB2/I;", PlaceTypes.STORAGE, "b", "(LB2/I;LC2/b;Ljava/util/List;Lmv/O;)LB2/h;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2912i {

    /* renamed from: a, reason: collision with root package name */
    public static final C2912i f2264a = new C2912i();

    @JvmOverloads
    public final <T> InterfaceC2911h<T> a(D<T> serializer, C2.b<T> corruptionHandler, List<? extends InterfaceC2909f<T>> migrations, InterfaceC15783O scope, Function0<? extends File> produceFile) {
        Intrinsics.j(serializer, "serializer");
        Intrinsics.j(migrations, "migrations");
        Intrinsics.j(scope, "scope");
        Intrinsics.j(produceFile, "produceFile");
        return b(new C2917n(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
    }

    @JvmOverloads
    public final <T> InterfaceC2911h<T> b(I<T> storage, C2.b<T> corruptionHandler, List<? extends InterfaceC2909f<T>> migrations, InterfaceC15783O scope) {
        Intrinsics.j(storage, "storage");
        Intrinsics.j(migrations, "migrations");
        Intrinsics.j(scope, "scope");
        if (corruptionHandler == null) {
            corruptionHandler = (C2.b<T>) new C2.a();
        }
        return new C2913j(storage, CollectionsKt.e(C2910g.INSTANCE.b(migrations)), corruptionHandler, scope);
    }

    private C2912i() {
    }
}
