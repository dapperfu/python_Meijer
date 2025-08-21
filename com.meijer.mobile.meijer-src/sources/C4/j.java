package C4;

import B4.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LC4/j;", "LB4/d$c;", "<init>", "()V", "LB4/d$b;", "configuration", "LB4/d;", "a", "(LB4/d$b;)LB4/d;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements d.c {
    @Override // B4.d.c
    public B4.d a(d.b configuration) {
        Intrinsics.j(configuration, "configuration");
        return new h(configuration.context, configuration.name, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
