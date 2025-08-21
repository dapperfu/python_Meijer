package lh;

import java.util.Objects;

/* renamed from: lh.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C15504n {

    /* renamed from: a, reason: collision with root package name */
    public final a f149633a;

    /* renamed from: lh.n$a */
    public enum a {
        COMPLETED,
        ERROR
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f149633a == ((C15504n) obj).f149633a;
    }

    public int hashCode() {
        return Objects.hash(this.f149633a);
    }

    public C15504n(a aVar) {
        this.f149633a = aVar;
    }
}
