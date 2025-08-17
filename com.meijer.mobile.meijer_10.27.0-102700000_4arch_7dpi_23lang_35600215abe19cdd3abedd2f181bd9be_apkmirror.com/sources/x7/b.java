package x7;

import Z7.ServerConfigurationV4;
import k8.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\r8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lx7/b;", "", "Lk8/q;", "config", "", "d", "(Lk8/q;)V", "LZ7/j;", "configV3", "a", "(LZ7/j;Lk8/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", "", "getServerId", "()Ljava/lang/Integer;", "c", "(Ljava/lang/Integer;)V", "serverId", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {
    Object a(ServerConfigurationV4 serverConfigurationV4, q qVar, Continuation<? super Unit> continuation);

    void b();

    void c(Integer num);

    void d(q config);
}
