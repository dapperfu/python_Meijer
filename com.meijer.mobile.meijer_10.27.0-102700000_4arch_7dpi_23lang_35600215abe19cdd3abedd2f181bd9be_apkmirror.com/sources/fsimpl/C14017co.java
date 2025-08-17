package fsimpl;

import android.content.SharedPreferences;

/* renamed from: fsimpl.co, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14017co extends AbstractC14018cp {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14015cm f131990a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C14017co(C14015cm c14015cm, EnumC14021cs enumC14021cs) {
        super(enumC14021cs, c14015cm.a(enumC14021cs));
        this.f131990a = c14015cm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // fsimpl.AbstractC14018cp
    public void a(SharedPreferences.Editor editor, String str, Boolean bool) {
        editor.putBoolean(str, bool.booleanValue());
    }
}
