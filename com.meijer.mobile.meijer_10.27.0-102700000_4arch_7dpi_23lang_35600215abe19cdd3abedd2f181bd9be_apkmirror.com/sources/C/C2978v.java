package C;

import androidx.camera.core.impl.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: C.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2978v {

    /* renamed from: C.v$a */
    static final class a implements F.G {

        /* renamed from: a, reason: collision with root package name */
        final List<androidx.camera.core.impl.j> f3531a;

        @Override // F.G
        public List<androidx.camera.core.impl.j> a() {
            return this.f3531a;
        }

        a(List<androidx.camera.core.impl.j> list) {
            if (list != null && !list.isEmpty()) {
                this.f3531a = Collections.unmodifiableList(new ArrayList(list));
                return;
            }
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
    }

    static F.G a(androidx.camera.core.impl.j... jVarArr) {
        return new a(Arrays.asList(jVarArr));
    }

    public static F.G b() {
        return a(new j.a());
    }
}
