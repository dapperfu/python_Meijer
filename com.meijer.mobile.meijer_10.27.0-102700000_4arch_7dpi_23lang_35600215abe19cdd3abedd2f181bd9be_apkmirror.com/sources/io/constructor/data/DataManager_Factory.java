package io.constructor.data;

import com.squareup.moshi.t;
import io.constructor.data.remote.ConstructorApi;
import kv.InterfaceC15323a;

/* loaded from: classes6.dex */
public final class DataManager_Factory implements Bu.d {
    private final InterfaceC15323a<ConstructorApi> constructorApiProvider;
    private final InterfaceC15323a<t> moshiProvider;

    public static DataManager_Factory create(InterfaceC15323a<ConstructorApi> interfaceC15323a, InterfaceC15323a<t> interfaceC15323a2) {
        return new DataManager_Factory(interfaceC15323a, interfaceC15323a2);
    }

    public static DataManager newInstance(ConstructorApi constructorApi, t tVar) {
        return new DataManager(constructorApi, tVar);
    }

    @Override // kv.InterfaceC15323a
    public DataManager get() {
        return newInstance(this.constructorApiProvider.get(), this.moshiProvider.get());
    }

    public DataManager_Factory(InterfaceC15323a<ConstructorApi> interfaceC15323a, InterfaceC15323a<t> interfaceC15323a2) {
        this.constructorApiProvider = interfaceC15323a;
        this.moshiProvider = interfaceC15323a2;
    }
}
