package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
interface e0 {
    int A() throws IOException;

    void B(List<String> list) throws IOException;

    void C(List<Float> list) throws IOException;

    boolean D() throws IOException;

    int E() throws IOException;

    void F(List<AbstractC6083g> list) throws IOException;

    void G(List<Double> list) throws IOException;

    long H() throws IOException;

    String I() throws IOException;

    <T> void J(T t10, f0<T> f0Var, C6090n c6090n) throws IOException;

    <T> void K(List<T> list, f0<T> f0Var, C6090n c6090n) throws IOException;

    <T> T L(Class<T> cls, C6090n c6090n) throws IOException;

    @Deprecated
    <T> T M(Class<T> cls, C6090n c6090n) throws IOException;

    <K, V> void N(Map<K, V> map, I.a<K, V> aVar, C6090n c6090n) throws IOException;

    <T> void O(T t10, f0<T> f0Var, C6090n c6090n) throws IOException;

    @Deprecated
    <T> void P(List<T> list, f0<T> f0Var, C6090n c6090n) throws IOException;

    int a();

    long b() throws IOException;

    void c(List<Integer> list) throws IOException;

    void d(List<Long> list) throws IOException;

    boolean e() throws IOException;

    long f() throws IOException;

    void g(List<Long> list) throws IOException;

    int h() throws IOException;

    void i(List<Long> list) throws IOException;

    void j(List<Integer> list) throws IOException;

    int k() throws IOException;

    int l() throws IOException;

    void m(List<Boolean> list) throws IOException;

    void n(List<String> list) throws IOException;

    AbstractC6083g o() throws IOException;

    int p() throws IOException;

    void q(List<Long> list) throws IOException;

    void r(List<Integer> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    long s() throws IOException;

    void t(List<Integer> list) throws IOException;

    int u() throws IOException;

    void v(List<Long> list) throws IOException;

    void w(List<Integer> list) throws IOException;

    void x(List<Integer> list) throws IOException;

    long y() throws IOException;

    String z() throws IOException;
}
