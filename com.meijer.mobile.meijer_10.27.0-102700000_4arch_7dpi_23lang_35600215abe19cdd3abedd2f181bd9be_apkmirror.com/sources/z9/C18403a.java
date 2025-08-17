package z9;

import e9.AbstractC13636a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lz9/a;", "Le9/a;", "", "", "args", "<init>", "([Ljava/lang/String;)V", "a", "[Ljava/lang/String;", "K", "()Ljava/lang/String;", "selection", "f", "()[Ljava/lang/String;", "selectionArgs", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: z9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18403a extends AbstractC13636a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] args;

    public C18403a(String[] args) {
        Intrinsics.j(args, "args");
        this.args = args;
    }

    @Override // e9.AbstractC13636a, e9.d
    /* renamed from: K */
    public String getSelection() {
        String strA = G9.c.a("request_id", this.args);
        Intrinsics.i(strA, "generateInStatement(...)");
        return strA;
    }

    @Override // e9.AbstractC13636a, e9.d
    /* renamed from: f, reason: from getter */
    public String[] getArgs() {
        return this.args;
    }
}
