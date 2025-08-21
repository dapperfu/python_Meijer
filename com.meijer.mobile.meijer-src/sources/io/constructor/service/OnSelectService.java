package io.constructor.service;

import android.app.IntentService;
import android.content.Intent;
import io.constructor.data.model.common.Result;
import io.constructor.data.model.common.ResultGroup;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import zu.C18553a;
import zu.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/constructor/service/OnSelectService;", "Landroid/app/IntentService;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "onHandleIntent", "(Landroid/content/Intent;)V", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class OnSelectService extends IntentService {
    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        String stringExtra;
        Serializable serializableExtra = intent == null ? null : intent.getSerializableExtra(C18553a.INSTANCE.c());
        if (serializableExtra == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.constructor.data.model.common.Result");
        }
        Result result = (Result) serializableExtra;
        if (StringsKt.s0(result.getValue()) || intent == null || (stringExtra = intent.getStringExtra(C18553a.INSTANCE.b())) == null) {
            return;
        }
        v vVar = v.f173287a;
        String value = result.getValue();
        List<ResultGroup> groups = result.getData().getGroups();
        v.L(vVar, value, stringExtra, "Search Suggestions", groups != null ? groups.get(0) : null, null, 16, null);
    }

    public OnSelectService() {
        super("OnSelectService");
    }
}
