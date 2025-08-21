package com.meijer.mobile.serverapi.rxjava;

import Lu.a;
import Lu.g;
import ev.C13889a;
import io.reactivex.b;
import io.reactivex.observers.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/serverapi/rxjava/CompletableAction;", "", "LLu/a;", "run", "<init>", "(LLu/a;)V", "Lio/reactivex/b;", "getCompletable", "()Lio/reactivex/b;", "LLu/g;", "", "actionConsumer", "", "errorConsumer", "execute", "(LLu/g;LLu/g;)V", "LLu/a;", "getRun", "()LLu/a;", "setRun", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompletableAction {
    public static final int $stable = 8;
    private a run;

    public CompletableAction(a run) {
        Intrinsics.j(run, "run");
        this.run = run;
    }

    public final void execute(final g<Unit> actionConsumer, final g<Throwable> errorConsumer) {
        Intrinsics.j(actionConsumer, "actionConsumer");
        Intrinsics.j(errorConsumer, "errorConsumer");
        getCompletable().e(Iu.a.a()).i(C13889a.b()).a(new c() { // from class: com.meijer.mobile.serverapi.rxjava.CompletableAction.execute.1
            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() throws Exception {
                actionConsumer.accept(Unit.f143329a);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable e10) throws Exception {
                Intrinsics.j(e10, "e");
                errorConsumer.accept(e10);
            }
        });
    }

    public final b getCompletable() {
        b bVarD = b.d(this.run);
        Intrinsics.i(bVarD, "fromAction(...)");
        return bVarD;
    }

    public final a getRun() {
        return this.run;
    }

    public final void setRun(a aVar) {
        Intrinsics.j(aVar, "<set-?>");
        this.run = aVar;
    }
}
