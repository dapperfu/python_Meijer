package com.google.firebase.perf.network;

import Xf.g;
import cg.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class b extends HttpsURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final c f89937a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpsURLConnection f89938b;

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f89937a.f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f89937a.r(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f89937a.S(i10);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f89937a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f89937a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f89937a.c();
    }

    public boolean equals(Object obj) {
        return this.f89937a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f89937a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f89938b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f89937a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f89937a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f89937a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f89937a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f89937a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f89937a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f89937a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f89937a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f89937a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f89937a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f89937a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f89937a.q();
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f89937a.s(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f89937a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f89937a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f89937a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f89937a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f89937a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f89938b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f89937a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f89937a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f89937a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f89937a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f89938b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f89938b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f89937a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f89938b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f89937a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f89937a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f89937a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f89937a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f89937a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f89937a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f89937a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f89938b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f89938b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f89937a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f89937a.L();
    }

    public int hashCode() {
        return this.f89937a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f89937a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f89937a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f89937a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f89937a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f89937a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f89937a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f89937a.T(j10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f89938b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f89937a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f89937a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f89937a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f89937a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f89937a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f89938b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f89937a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f89937a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f89937a.b0();
    }

    b(HttpsURLConnection httpsURLConnection, l lVar, g gVar) {
        super(httpsURLConnection.getURL());
        this.f89938b = httpsURLConnection;
        this.f89937a = new c(httpsURLConnection, lVar, gVar);
    }
}
