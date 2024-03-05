package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.amazon.awscdk.services.ecs.Cluster;

public class CdkAwsAluraInfraStack extends Stack {
    public CdkAwsAluraInfraStack(final Construct scope, final String id) {
        this(scope, id, null );
    }

    public CdkAwsAluraInfraStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        
    }
}
