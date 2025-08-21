package v7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l8.InterfaceC15473a;
import m8.q;
import z7.InterfaceC18459b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv7/a;", "Ll8/a;", "Lz7/b;", "communicationManager", "<init>", "(Lz7/b;)V", "Lm8/q;", "serverConfigurationV3", "", "a", "(Lm8/q;)V", "", "serverId", "b", "(I)V", "Lz7/b;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: v7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17644a implements InterfaceC15473a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18459b communicationManager;

    public C17644a(InterfaceC18459b communicationManager) {
        Intrinsics.j(communicationManager, "communicationManager");
        this.communicationManager = communicationManager;
    }

    @Override // l8.InterfaceC15473a
    public void a(q serverConfigurationV3) {
        Intrinsics.j(serverConfigurationV3, "serverConfigurationV3");
        this.communicationManager.a(serverConfigurationV3);
    }

    @Override // l8.InterfaceC15473a
    public void b(int serverId) {
        this.communicationManager.c(Integer.valueOf(serverId));
        z8.f.a("dtxCommunication", "received external server id update to: " + serverId);
    }
}
