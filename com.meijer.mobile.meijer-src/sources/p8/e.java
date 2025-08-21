package p8;

import B2.InterfaceC2911h;
import android.content.Context;
import androidx.datastore.core.CorruptionException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroid/content/Context;", "LB2/h;", "LF2/f;", "b", "Lkotlin/properties/ReadOnlyProperty;", "c", "(Landroid/content/Context;)LB2/h;", "dataStore", "agent.core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f156233a = {Reflection.j(new PropertyReference1Impl(e.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b, reason: collision with root package name */
    private static final ReadOnlyProperty f156234b = E2.a.b("dynatrace-legacy-preferences", new C2.b(new Function1() { // from class: p8.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return e.b((CorruptionException) obj);
        }
    }), null, null, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final F2.f b(CorruptionException it) {
        Intrinsics.j(it, "it");
        return F2.g.a();
    }

    public static final InterfaceC2911h<F2.f> c(Context context) {
        Intrinsics.j(context, "<this>");
        return (InterfaceC2911h) f156234b.getValue(context, f156233a[0]);
    }
}
