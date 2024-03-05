package com.myorg;

import software.amazon.awscdk.App;

public class CdkAwsAluraInfraApp {
	
    public static void main(final String[] args) {
        App app = new App();

        AluraVpcStack vpcStack = new AluraVpcStack(app, "Vpc");
        AluraClusterStack clusterStack = new AluraClusterStack(app, "Cluster", vpcStack.getVpc());
        clusterStack.addDependency(clusterStack); // o cluster não iniciar sem a vpc original

        app.synth();
    }
}

