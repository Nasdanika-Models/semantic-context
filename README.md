# Semantic Context Model (SCM)

A declarative, diagram-first way to define **bounded semantic slices** across one or more source models — enabling clean projections, simplified metamodels, unified views, 
and safe agent-bounded contexts.

## What this project is

The Semantic Context Model (SCM) is an Ecore-based specification that lets you define *how to project* one or more complex source models 
(e.g., [UAF](https://uaf.models.nasdanika.org/uaf/index.html), [Jira](https://jira.models.nasdanika.org/), [GitLab](https://gitlab.models.nasdanika.org/), custom domain models) into a **simplified, unified, meaningful context**.

SCM acts as a **semantic firewall**: 

- Shielding your domain from upstream complexity 
- Enabling clean, stable, human-friendly models 
- Powering agent-safe schemas and bounded contexts  
- Enabling cross-model unification (e.g., Jira issues <-> GitLab commits)

## Why this matters

Modern systems increasingly rely on: 

- **LLM agents** that need small, stable, predictable schemas 
- **Complex enterprise models** (UAF, DoDAF, ArchiMate) that are too large and unstable for direct use 
- **Heterogeneous data sources** (Jira, GitLab, Confluence, CRM, ERP) that need semantic alignment 
- **Diagram-first workflows** where humans define meaning visually 

SCM provides the missing layer: a **declarative, versionable, inspectable specification** that defines *what the world looks like* for a given context, agent, or integration.

## What SCM enables

- Create **simple context models** from complex frameworks like UAF 
- Build **DDD-style bounded contexts** directly from diagrams 
- Generate **agent-ready schemas** from model slices 
- Unify multiple source models (e.g., Jira + GitLab) into a single semantic view 
- Provide a **semantic anti-corruption layer** between systems 
- Support **diagram-first elicitation** of knowledge from SMEs and founders 
- Enable **local, offline, sovereign modeling** with Git as the database 

## Why contributors might care

This project sits at the intersection of: 
- Model-Driven Engineering 
- Domain-Driven Design 
- Multi-agent systems 
- Knowledge graphs 
- Semantic interoperability 
- Enterprise architecture 
- AI safety and governance 

If you’re interested in any of these areas, SCM is a chance to help define a **new category**: 
**Model-Bound Agentic Systems** — where agents operate on formal, bounded semantic slices rather than unstructured text.

## Current status

The repository contains the initial model and documentation.

## Roadmap

- Refine the spec
- Implement a documentation generator for publishing context spec for humans.
- Implement a translator or translators which:
    * Generates the context metamodel, which can then be translated to JSON schema for agents.
    * Takes input models and generates an output model which and then be translated to JSON compliant to the JSON schema generated from the metamodel
- UI for defining the specification. Options:
    * [Tree-based designer](https://nasdanika-demos.github.io/illustrations/semantic-context-designer/index.html) - can be implemented as a Web application served by a [CLI](https://docs.nasdanika.org/core/cli/index.html) command.
    * [Visual ontology](https://nasdanika-demos.github.io/illustrations/visual-schema/index.html)
    * Tree mapper similar to the [Eclipse Nebula Treemapper](https://eclipse.dev/nebula/widgets/treemapper/treemapper.html)

