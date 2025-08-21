package fsimpl;

import android.content.SharedPreferences;

/* renamed from: fsimpl.co, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14142co extends AbstractC14143cp {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14140cm f133240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C14142co(C14140cm c14140cm, EnumC14146cs enumC14146cs) {
        super(enumC14146cs, c14140cm.a(enumC14146cs));
        this.f133240a = c14140cm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // fsimpl.AbstractC14143cp
    public void a(SharedPreferences.Editor editor, String str, Boolean bool) {
        editor.putBoolean(str, bool.booleanValue());
    }
}
