package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/e0;", "Lcom/bugsnag/android/m0$a;", "", "", "", PlaceTypes.STORE, "<init>", "(Ljava/util/Map;)V", "name", "variant", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/bugsnag/android/m0;", "stream", "toStream", "(Lcom/bugsnag/android/m0;)V", "", "Lcom/bugsnag/android/c0;", "c", "()Ljava/util/List;", "b", "()Lcom/bugsnag/android/e0;", "Ljava/lang/String;", "emptyVariant", "Ljava/util/Map;", "getStore$bugsnag_android_core_release", "()Ljava/util/Map;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6466e0 implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String emptyVariant;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> store;

    /* JADX WARN: Multi-variable type inference failed */
    public C6466e0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public synchronized void a(String name, String variant) {
        this.store.remove(name);
        Map<String, String> map = this.store;
        if (variant == null) {
            variant = this.emptyVariant;
        }
        map.put(name, variant);
    }

    public final synchronized C6466e0 b() {
        return new C6466e0(MapsKt.D(this.store));
    }

    public final synchronized List<C6462c0> c() {
        ArrayList arrayList;
        Set<Map.Entry<String, String>> setEntrySet = this.store.entrySet();
        arrayList = new ArrayList(CollectionsKt.x(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (Intrinsics.e(str2, this.emptyVariant)) {
                str2 = null;
            }
            arrayList.add(new C6462c0(str, str2));
        }
        return arrayList;
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 stream) throws IOException {
        Map mapA;
        synchronized (this) {
            mapA = MapsKt.A(this.store);
        }
        stream.c();
        for (Map.Entry entry : mapA.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            stream.d();
            stream.l("featureFlag").O(str);
            if (!Intrinsics.e(str2, this.emptyVariant)) {
                stream.l("variant").O(str2);
            }
            stream.i();
        }
        stream.h();
    }

    public C6466e0(Map<String, String> map) {
        this.store = map;
        this.emptyVariant = "__EMPTY_VARIANT_SENTINEL__";
    }

    public /* synthetic */ C6466e0(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
