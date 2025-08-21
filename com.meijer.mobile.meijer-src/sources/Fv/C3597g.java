package Fv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"LFv/g;", "", "<init>", "()V", "", "size", "", "b", "(I)[C", "array", "", "a", "([C)V", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "arrays", "I", "charsTotal", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Fv.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3597g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<char[]> arrays = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int charsTotal;

    protected final char[] b(int size) {
        char[] cArrY;
        synchronized (this) {
            cArrY = this.arrays.y();
            if (cArrY != null) {
                this.charsTotal -= cArrY.length;
            } else {
                cArrY = null;
            }
        }
        return cArrY == null ? new char[size] : cArrY;
    }

    protected final void a(char[] array) {
        Intrinsics.j(array, "array");
        synchronized (this) {
            try {
                if (this.charsTotal + array.length < C3595e.f11042a) {
                    this.charsTotal += array.length;
                    this.arrays.addLast(array);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
