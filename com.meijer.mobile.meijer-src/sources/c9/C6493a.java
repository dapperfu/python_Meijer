package c9;

import android.database.Cursor;
import b9.C6341a;
import d9.C13643a;
import e9.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lc9/a;", "", "Lb9/a;", "emarsysContentResolver", "Ld9/a;", "crypto", "", "", "sharedPackageNames", "<init>", "(Lb9/a;Ld9/a;Ljava/util/List;)V", "a", "()Ljava/lang/String;", "Lb9/a;", "b", "Ld9/a;", "c", "Ljava/util/List;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: c9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6493a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6341a emarsysContentResolver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13643a crypto;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> sharedPackageNames;

    public C6493a(C6341a emarsysContentResolver, C13643a crypto, List<String> list) {
        Intrinsics.j(emarsysContentResolver, "emarsysContentResolver");
        Intrinsics.j(crypto, "crypto");
        this.emarsysContentResolver = emarsysContentResolver;
        this.crypto = crypto;
        this.sharedPackageNames = list;
    }

    public String a() {
        String string = null;
        if (this.sharedPackageNames == null) {
            return null;
        }
        String strA = null;
        for (int i10 = 0; string == null && i10 < this.sharedPackageNames.size(); i10++) {
            Cursor cursorA = this.emarsysContentResolver.a(b.f130044a.a(this.sharedPackageNames.get(i10)), new String[]{"encrypted_hardware_id", "salt", "iv"}, null, null, null);
            if (cursorA != null && cursorA.moveToFirst()) {
                string = cursorA.getString(cursorA.getColumnIndexOrThrow("encrypted_hardware_id"));
                String string2 = cursorA.getString(cursorA.getColumnIndexOrThrow("salt"));
                String string3 = cursorA.getString(cursorA.getColumnIndexOrThrow("iv"));
                C13643a c13643a = this.crypto;
                Intrinsics.g(string);
                Intrinsics.g(string2);
                Intrinsics.g(string3);
                strA = c13643a.a(string, string2, string3);
                cursorA.close();
            }
        }
        return strA;
    }
}
