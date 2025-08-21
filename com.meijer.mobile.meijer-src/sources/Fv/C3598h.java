package Fv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LFv/h;", "LFv/g;", "<init>", "()V", "", "d", "()[C", "array", "", "c", "([C)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Fv.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3598h extends C3597g {

    /* renamed from: c, reason: collision with root package name */
    public static final C3598h f11046c = new C3598h();

    public final void c(char[] array) {
        Intrinsics.j(array, "array");
        if (array.length == 16384) {
            a(array);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
    }

    public final char[] d() {
        return super.b(16384);
    }

    private C3598h() {
    }
}
