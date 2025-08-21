package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/bugsnag/android/o0;", "Lcom/bugsnag/android/v0$a;", "", "", "Lcom/bugsnag/android/m0;", "flags", "<init>", "([Lcom/bugsnag/android/m0;)V", "()V", "", "name", "variant", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/bugsnag/android/v0;", "stream", "toStream", "(Lcom/bugsnag/android/v0;)V", "", "c", "()Ljava/util/List;", "b", "()Lcom/bugsnag/android/o0;", "[Lcom/bugsnag/android/m0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6611o0 implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile C6607m0[] flags;

    private C6611o0(C6607m0[] c6607m0Arr) {
        this.flags = c6607m0Arr;
    }

    public void a(String name, String variant) {
        C6607m0[] c6607m0Arr;
        synchronized (this) {
            try {
                C6607m0[] c6607m0Arr2 = this.flags;
                int length = c6607m0Arr2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    }
                    int i11 = i10 + 1;
                    if (Intrinsics.e(c6607m0Arr2[i10].b(), name)) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
                if (i10 == -1) {
                    c6607m0Arr = (C6607m0[]) ArraysKt.J(c6607m0Arr2, new C6607m0(name, variant));
                } else {
                    if (Intrinsics.e(c6607m0Arr2[i10].d(), variant)) {
                        return;
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(c6607m0Arr2, c6607m0Arr2.length);
                    Intrinsics.i(objArrCopyOf, "copyOf(this, size)");
                    ((C6607m0[]) objArrCopyOf)[i10] = new C6607m0(name, variant);
                    c6607m0Arr = (C6607m0[]) objArrCopyOf;
                }
                this.flags = c6607m0Arr;
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C6611o0 b() {
        return new C6611o0(this.flags);
    }

    public final List<C6607m0> c() {
        C6607m0[] c6607m0Arr = this.flags;
        ArrayList arrayList = new ArrayList(c6607m0Arr.length);
        int length = c6607m0Arr.length;
        int i10 = 0;
        while (i10 < length) {
            C6607m0 c6607m0 = c6607m0Arr[i10];
            i10++;
            arrayList.add(new C6607m0(c6607m0.getKey(), c6607m0.getValue()));
        }
        return arrayList;
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 stream) throws IOException {
        C6607m0[] c6607m0Arr = this.flags;
        stream.c();
        int length = c6607m0Arr.length;
        int i10 = 0;
        while (i10 < length) {
            C6607m0 c6607m0 = c6607m0Arr[i10];
            i10++;
            String key = c6607m0.getKey();
            String value = c6607m0.getValue();
            stream.d();
            stream.l("featureFlag").O(key);
            if (value != null) {
                stream.l("variant").O(value);
            }
            stream.i();
        }
        stream.h();
    }

    public C6611o0() {
        this(new C6607m0[0]);
    }
}
