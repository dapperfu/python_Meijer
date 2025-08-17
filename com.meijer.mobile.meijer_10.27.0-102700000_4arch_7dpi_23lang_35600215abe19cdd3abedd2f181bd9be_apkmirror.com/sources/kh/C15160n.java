package kh;

import java.util.Objects;

/* renamed from: kh.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C15160n {

    /* renamed from: a, reason: collision with root package name */
    public final a f141950a;

    /* renamed from: kh.n$a */
    public enum a {
        COMPLETED,
        ERROR
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f141950a == ((C15160n) obj).f141950a;
    }

    public int hashCode() {
        return Objects.hash(this.f141950a);
    }

    public C15160n(a aVar) {
        this.f141950a = aVar;
    }
}
